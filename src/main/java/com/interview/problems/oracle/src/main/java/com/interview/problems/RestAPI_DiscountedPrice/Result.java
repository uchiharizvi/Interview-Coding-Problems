package com.interview.problems.RestAPI_DiscountedPrice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

import org.json.JSONObject;
import org.json.JSONArray;

public class Result {
    public static int getDiscountedPrice(int barCode) {
        try {
            String urlString = "https://jsonmock.hackerrank.com/api/inventory?barcode=" + barCode;
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            JSONObject jsonObject = new JSONObject(response.toString());
            JSONArray responseArray = jsonObject.getJSONArray("data");
            if (responseArray.length() == 0) {
                return -1;
            }
            JSONObject item = responseArray.getJSONObject(0);
            double price = item.getDouble("price");
            double discount = item.getDouble("discount");
            return (int) Math.round(price - ((discount / 100) * price));
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
