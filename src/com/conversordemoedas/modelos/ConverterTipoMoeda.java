package com.conversordemoedas.modelos;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConverterTipoMoeda {
    private double taxaCambio;

    public double getTaxaCambio() {
        return taxaCambio;
    }

    public ConverterTipoMoeda(String moeda1, String moeda2) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/f38f54c59393609b573843d3/pair/" + moeda1 + "/" + moeda2))
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            Gson gson = new Gson();

            ApiResponse apiResponse = gson.fromJson(response.body(), ApiResponse.class);
            this.taxaCambio = apiResponse.conversion_rate;

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static class ApiResponse {
        double conversion_rate;
    }
}
