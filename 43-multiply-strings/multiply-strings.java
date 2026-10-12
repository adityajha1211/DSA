class Solution {
    public String multiply(String num1, String num2) {
      if(num1.equals("0") || num2.equals("0")) return "0";
      int[] ok = new int[num1.length()+num2.length()];
      for(int i = num1.length()-1;i>=0;i--){
        for(int j = num2.length()-1;j>=0;j--){
            int product = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
            int sum = product+ok[i+j+1];
            ok[i+j+1] = sum%10;
            ok[i+j] += sum/10;
        }
      }
      StringBuilder ans = new StringBuilder();
      for(int jha: ok){
        if(ans.length()==0 && jha==0) continue;
        ans.append(jha);
      }
      return ans.toString();
    }
}