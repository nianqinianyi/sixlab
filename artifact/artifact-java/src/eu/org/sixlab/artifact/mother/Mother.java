/* 
 *******************************************************************************************
 * Copyright www.ebidding.net.cn 2014年11月29日 Authors: 曹林伟 <caolinwei@ebidding.com.cn>*
 *******************************************************************************************
 */
package eu.org.sixlab.artifact.mother;

/**
 * 作者:曹林伟 创建时间:2014年11月29日 功能描述： 版本:2.0.0
 */
public class Mother {
    
    private String[] msg = { "我来到世界看到的第一个人是她", 
                              "我开口讲的第一句话是ma~ma",
                              "我饿了、委屈了、失恋了她安慰我", 
                              "我孤单、迷惘、走投无路她是我的避风港", 
                              "我祈求岁月，你别伤害美丽的她",
                              "哪知风霜早已爬上鬓角，青丝成白发", 
                              "无论我多大，在她眼中始终是个长不大的小孩" };
    
    private static final int LENGTH = 30;
    
    public void end() {
        
        System.out.println();
        System.out.println("每个人都只有一个妈妈");
        System.out.println("要好好的孝敬我们的妈妈");
        System.out.println("愿：天下所有母亲节日快乐");
        System.out.println("--          ---@星期夭");
    }
    
    public void say() {
        
        boolean finish = false;
        int row = 0;
        
        while (!finish) {
            boolean row_finish = false;
            int blanklen = LENGTH;
            while (!row_finish) {
                System.out.println(getWords(row, blanklen));
                blanklen--;
                if (blanklen == 0) {
                    row_finish = true;
                    row++;
                }
                if (row == msg.length && blanklen == 0) {
                    finish = true;
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        end();
    }
    
    public String getWords(int row, int len) {
        
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < row; i++) {
            sb.append(msg[i] + "\n");
        }
        
        int subLen = 0;
        if (LENGTH - len < msg[row].length()) {
            subLen = LENGTH - len + 1;
        } else {
            subLen = msg[row].length();
        }
        sb.append(blank(len) + msg[row].substring(0, subLen));
        
        for (int i = row; i < msg.length; i++) {
            sb.append("\n");
        }
        
        return sb.toString();
    }
    
    public String blank(int len) {
        
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < len; i++) {
            sb.append(" ");
        }
        return sb.toString();
    }
    
    public void run() {
        
        say();
    }
    
    public static void main(String[] args) {
        
        Mother mother = new Mother();
        mother.run();
    }
}
