package com.ad.homework02.guess;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class guess {
    public int max;
    public int min;
    public int chance;
    public int random_num;
    public int guess_num;
    public int rule;

    public static String[] compare={"大","小","等于","是","大多少","小多少"};


    public guess() {
    }

    //todo 进行对话猜测
    public void AI_guess()
    {
        Scanner sc = new Scanner(System.in);
        while(chance!=0) {
            System.out.println("你猜一下随机数是什么("+min+","+max+"):");
            System.out.println("剩余次数："+chance+"次"+"  退出游戏输入-1");
            String question=sc.next();
            String num="";
            for (int i = 0; i < question.length(); i++) {
                //todo 获取数字
                char c=question.charAt(i);
                if(c>='0'&&c<='9'){
                    num+=c;
                }

                if(question.contains("大"))
                    rule=0;
                else if(question.contains("小"))
                    rule=1;
                else if(question.contains("等")||(question.startsWith("是")&&!question.contains("比")))
                    rule=2;
                else rule=3;

            }
            if(num.length()!=0)
            guess_num = parseInt(num);
            else guess_num=-1;
            switch (rule){
                case 0:{
                    chance--;
                    if(guess_num<random_num) {
                        System.out.println("你说对了");
                        System.out.println(question.replace("吗","!"));
                        System.out.println("你还剩余："+chance+"次");
                    }
                    else{
                        System.out.println("抱歉你说错了");
                    System.out.println(question.replace("大","不大").replace("吗","!"));
                        System.out.println("你还剩余："+chance+"次");
                    }
                break;
                }
                case 1:{
                    chance--;
                    if(guess_num>random_num)
                    {
                        System.out.println("你说对了");
                        System.out.println(question.replace("吗","!"));
                        System.out.println("你还剩余："+chance+"次");
                    }
                    else{
                        System.out.println("抱歉你说错了");
                        System.out.println(question.replace("小","不小").replace("吗","!"));
                        System.out.println("你还剩余："+chance+"次");
                    }
                    break;
                }
                case 2:{
                        chance--;
                        if(guess_num<min||guess_num>max)
                        {
                            System.out.println("你猜测数不在范围内");
                            System.out.println("请输入你猜测数("+min+","+max+"):");
                            System.out.println("你还剩余："+chance+"次");
                        }
                  if (guess_num==random_num){
                      System.out.println("恭喜你猜对了。"+"数字是："+random_num);
                      return;
                  }else
                      System.out.println("抱歉你说错了");
                  if(question.contains("等"))
                    System.out.println(question.replace("等","不等").replace("吗","!"));
                if(question.contains("是"))
                    System.out.println(question.replace("是","不是").replace("吗","!"));
                break;
                }
                case 3: System.out.println(question + "！");

                    System.out.println("你还剩余："+chance+"次");
                System.out.println();
            }

            }
        System.out.println("机会用完了，你没有猜中的数字为"+random_num);
        System.out.println("-------------------");
        System.out.println();
        return;
    }




    //todo 构造函数 调用函数产生随机数
    public guess(int max, int min, int chance) {
        this.max = max;
        this.min = min;
        this.chance = chance;
        this.random_num=this.creat_num();
    }

    //todo 私有 产生随机数的函数
    private int creat_num(){
        Random r = new Random();
        int range=this.max-this.min+1;
        int num=r.nextInt(range)+this.min;
        return num;
    }
}
