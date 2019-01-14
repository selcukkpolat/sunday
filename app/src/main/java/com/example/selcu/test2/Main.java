package com.example.selcu.test2;
public class Main {
    public static void main(String[] args) {
        //i =year j=month a=day
        int count=0;
       // int c=0;
        for (int i=1900;i<2001;i++){
            for(int j=1;j<=12;j++){
                int a=0;
                if(j==1 || j==3 || j==5 || j==7 || j==8 || j==10 || j==12){
                    a=31;
                }
                else if (j==2){
                    if(i%4==0)
                    {
                        if((i+100)%400==0)
                            a=28;
                        else
                            a=29;
                    }
                    else
                        a=28;
                }
                else{
                    a=30;
                }
                for (int k=1;k<=a;k++){
                    count++;
                    if(k==1 && (count%7==0)){
                        System.out.println(+k+"/"+j+"/"+i);
                       // c++;
                        //System.out.println(c);
                    }
                }
            }
        }
    }
}
