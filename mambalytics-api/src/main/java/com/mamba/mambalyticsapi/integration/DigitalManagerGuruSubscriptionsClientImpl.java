package com.mamba.mambalyticsapi.integration;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

public class DigitalManagerGuruSubscriptionsClientImpl {

    private final String SUBSCRIPTIONS_URL = "https://digitalmanager.guru/api/v1/subscriptions";

    Client client = ClientBuilder.newClient();

    public void getAccountToken() {

        try {
            Response response = client.target("https://digitalmanager.guru/api/clients/tokenisvalid/account_token")
                    .request(MediaType.TEXT_PLAIN_TYPE)
                    .get();

            System.out.println("status: " + response.getStatus());
            System.out.println("headers: " + response.getHeaders());
            System.out.println("body:" + response.readEntity(String.class));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public String getSubscriptions() {
        try {
            Response response = client.target(SUBSCRIPTIONS_URL)
                    .request(MediaType.APPLICATION_JSON_TYPE)
                    .header("Authorization", "Bearer {user_token}")
                    .header("Accept", "application/json")
                    .get();

            System.out.println("status: " + response.getStatus());
            System.out.println("headers: " + response.getHeaders());
            System.out.println("body:" + response.readEntity(String.class));
            return "";
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public void cancelSubscription() {

        try {
            Entity<String> payload = Entity.text("");
            Response response = client.target("https://digitalmanager.guru/api/v1/subscriptions/{id/subscription_code}/cancel")
                    .request(MediaType.TEXT_PLAIN_TYPE)
                    .post(payload);

            System.out.println("status: " + response.getStatus());
            System.out.println("headers: " + response.getHeaders());
            System.out.println("body:" + response.readEntity(String.class));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void revertCancellation() {

        try {
            Response response = client.target("https://digitalmanager.guru/api/v1/subscriptions/{id/subscription_code}/cancel-at-cycle-end")
                    .request(MediaType.TEXT_PLAIN_TYPE)
                    .delete();

            System.out.println("status: " + response.getStatus());
            System.out.println("headers: " + response.getHeaders());
            System.out.println("body:" + response.readEntity(String.class));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void getAllTransactions() {

        try {
            Response response = client.target("https://digitalmanager.guru/api/v1/subscriptions/{id/subscription_code}/transactions")
                    .request(MediaType.TEXT_PLAIN_TYPE)
                    .get();

            System.out.println("status: " + response.getStatus());
            System.out.println("headers: " + response.getHeaders());
            System.out.println("body:" + response.readEntity(String.class));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void getAllInvoices() {

        try {
            Response response = client.target("https://digitalmanager.guru/api/v1/subscriptions/{id/subscription_code}/invoices")
                    .request(MediaType.TEXT_PLAIN_TYPE)
                    .get();

            System.out.println("status: " + response.getStatus());
            System.out.println("headers: " + response.getHeaders());
            System.out.println("body:" + response.readEntity(String.class));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void getInvoice() {

        try {
            Response response = client.target("https://digitalmanager.guru/api/v1/subscriptions/{id/subscription_code}/invoices/{invoice_code}")
                    .request(MediaType.TEXT_PLAIN_TYPE)
                    .get();

            System.out.println("status: " + response.getStatus());
            System.out.println("headers: " + response.getHeaders());
            System.out.println("body:" + response.readEntity(String.class));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void getAllTransactionsOfInvoice() {

        try {
            Response response = client.target("https://digitalmanager.guru/api/v1/subscriptions/{id/subscription_code}/invoices/{invoice_code}/transactions")
                    .request(MediaType.TEXT_PLAIN_TYPE)
                    .get();

            System.out.println("status: " + response.getStatus());
            System.out.println("headers: " + response.getHeaders());
            System.out.println("body:" + response.readEntity(String.class));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void alterDateOfCycleEnd () {

        try {
            Entity<String> payload = Entity.text("");
            Response response = client.target("https://digitalmanager.guru/api/v1/subscriptions/{id/subscription_code}/cycle-end-date")
                    .request(MediaType.TEXT_PLAIN_TYPE)
                    .put(payload);

            System.out.println("status: " + response.getStatus());
            System.out.println("headers: " + response.getHeaders());
            System.out.println("body:" + response.readEntity(String.class));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void alterActualOfferAndRenovation() {

        try {
            Entity<String> payload = Entity.text("");
            Response response = client.target("https://digitalmanager.guru/api/v1/subscriptions/{id/subscription_code}/current-offer")
                    .request(MediaType.TEXT_PLAIN_TYPE)
                    .put(payload);

            System.out.println("status: " + response.getStatus());
            System.out.println("headers: " + response.getHeaders());
            System.out.println("body:" + response.readEntity(String.class));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void alterRenovationOffer() {

        try {
            Entity<String> payload = Entity.text("");
            Response response = client.target("https://digitalmanager.guru/api/v1/subscriptions/{id/subscription_code}/next-offer")
                    .request(MediaType.TEXT_PLAIN_TYPE)
                    .put(payload);

            System.out.println("status: " + response.getStatus());
            System.out.println("headers: " + response.getHeaders());
            System.out.println("body:" + response.readEntity(String.class));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
