//package com.example.siva.chefmate;
//
//import android.os.AsyncTask;
//import android.util.Log;
//import android.view.View;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//
///**
// * Created by Siva on 9/24/2016.
// */
//
//public class fetchIngredients  extends AsyncTask<Void, Void, String> {
//
//    private Exception exception;
//
//    protected void onPreExecute() {
//        progressBar.setVisibility(View.VISIBLE);
//        responseView.setText("");
//    }
//
//    protected String doInBackground(Void... urls) {
//        String email = emailText.getText().toString();
//        // Do some validation here
//
//        try {
//            HttpResponse<JsonNode> response = Unirest.post("https://spoonacular-recipe-food-nutrition-v1.p.mashape.com/food/products/classify")
//                    .header("X-Mashape-Key", "AwyMRl6SrqmshGveP2uwMtBoo8XEp1MOJaJjsnyz3xSc8qHey1")
//                    .header("Content-Type", "application/json")
//                    .header("Accept", "application/json")
//                    .body("{\"title\":\"Kroger Vitamin A & D Reduced Fat 2% Milk\",\"upc\":\"\",\"plu_code\":\"\"}")
//                    .asJson();
//            }
//            finally{
//                urlConnection.disconnect();
//            }
//        }
//        catch(Exception e) {
//            Log.e("ERROR", e.getMessage(), e);
//            return null;
//        }
//    }
//
//    protected void onPostExecute(String response) {
//        if(response == null) {
//            response = "THERE WAS AN ERROR";
//        }
//        progressBar.setVisibility(View.GONE);
//        Log.i("INFO", response);
//        responseView.setText(response);
//    }
//}
//
