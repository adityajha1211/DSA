class Solution {
    public String intToRoman(int num) {
        int ab = num;
       HashMap<Integer,String> map = new HashMap<>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
      
       String jha = "";
         while(num >=1000){
            int ok = num/1000;
            jha+="M".repeat(ok);
            num = num%1000;
         }
           while(num>= 900){
            int ok = num/900;
            jha+="CM".repeat(ok);
            num = num%900;
         }
          while(num>=500){
            int ok = num/500;
            jha+="D".repeat(ok);
            num = num%500;
         }
          while(num>=400){
            int ok = num/400;
            jha+="CD".repeat(ok);
            num = num%400;
         }
          while(num>=100){
            int ok = num/100;
            jha+="C".repeat(ok);
            num = num%100;
         }
          while(num>=90){
            int ok = num/90;
            jha+="XC".repeat(ok);
            num = num%90;
         }
          while(num>=50){
            int ok = num/50;
            jha+="L".repeat(ok);
            num = num%50;
         }
           while(num>=40){
            int ok = num/40;
            jha+="XL".repeat(ok);
            num = num%40;
         }
           while(num>=10){
            int ok = num/10;
            jha+="X".repeat(ok);
            num = num%10;
         }
           while(num>=9){
            int ok = num/9;
            jha+="IX".repeat(ok);
            num = num%9;
         }
           while(num>=5){
            int ok = num/5;
            jha+="V".repeat(ok);
            num = num%5;
         }
           while(num>=4){
            int ok = num/4;
            jha+="IV".repeat(ok);
            num = num%4;
         }
           while(num>=1){
            int ok = num/1;
            jha+="I".repeat(ok);
            num = num%1;
         }
         return jha;
    }
}