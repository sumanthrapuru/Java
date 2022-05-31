package com.work.qrcode;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Razorpay {
    public static void main(String[] args) throws MalformedURLException {
        int count = 0;
        while (true){
            URL url = new URL("https://api.razorpay.com/v1/payments/qr_codes/qr_JWekAT9YAIEfu5/payments");
            HttpURLConnection http;
            try {
                http = (HttpURLConnection)url.openConnection();
                http.setRequestProperty("Authorization", "Basic cnpwX2xpdmVfZnAwZ0FOZDdGMHhHSlM6bmlETDF4cWxnQzV2d2xERFNsT3huc3pj");
                int statusCode = http.getResponseCode();
                    System.out.println(count++ + " " + statusCode + " " + http.getResponseMessage());
                if(statusCode != 200){
                    System.out.println(count++ + " " + statusCode + " " + http.getResponseMessage());
                }
                http.disconnect();
                Thread.sleep(200L);


            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }

    public static void main3(String[] args) throws Exception{
        while (true){
            URL url = new URL("https://payment.internal.staging.gorio.in/api/v3.1/transactions/111095?update=true&retailerId=9181");
            HttpURLConnection http = (HttpURLConnection)url.openConnection();
            http.setRequestProperty("Content-Type", "application/json");
            http.setRequestProperty("x-userRole", "RETAILERSALESMAN");
            http.setRequestProperty("version", "3.2.2");
            http.setRequestProperty("source", "web");
            http.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJvbXNVc2VySWQiOjIyLCJvbXNSb2xlSWQiOjIsIm9tc1JvbGUiOiJSRVRBSUxFUlNBTEVTTUFOIiwiaXNzIjoiaHR0cDovL29tcy5jb20iLCJleHAiOjE2NjIzODUwODksImlhdCI6MTY0NjgzMzA4OX0.kQ_DcktpqlyzDB4H2qutEDDIFblxjLtV1VhZiYgyyuI#cc8cd0f1-cd61-4635-9486-188cb16e9e0b");

            System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
            if(http.getResponseCode() != 200){
                System.out.println(http.getResponseCode());
            }
            http.disconnect();
            Thread.sleep(1000L);


        }
    }
}
