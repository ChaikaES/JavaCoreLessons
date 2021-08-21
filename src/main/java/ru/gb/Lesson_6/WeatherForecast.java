package ru.gb.Lesson_6;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherForecast {
    public static void main(String[] args) {
        String appid = "5b6b3dd21ad550f91e2ef9a4318ccae9";
        String lattitude = "59.9339";
        String longitude = "30.3061";
        String exclude = "current,minutely,hourly,alerts";
        String units = "metric";
        String urlAddress = (
                "https://api.openweathermap.org/data/2.5/onecall?lat=" + lattitude +
                        "&lon=" + longitude + "&exclude=" + exclude +
                        "&appid=" + appid + "&units=" + units
        );

        try {
            URL url = new URL(urlAddress);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();

            BufferedInputStream stream = new BufferedInputStream(connection.getInputStream());
            int x;
            while ((x = stream.read()) != -1) {
                System.out.print((char)x);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
