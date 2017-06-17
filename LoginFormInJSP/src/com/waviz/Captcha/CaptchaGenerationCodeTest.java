package com.waviz.Captcha;


 

 
  public class CaptchaGenerationCodeTest{
 public static void main(String[] args){
	 CaptchaGenerationCode captcha = new CaptchaGenerationCode();
  String str = captcha.generateCaptcha();
  System.out.println(str);
 }
}
 