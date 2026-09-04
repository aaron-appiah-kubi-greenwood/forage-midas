package com.jpmc.midascore.component;

import com.jpmc.midascore.foundation.Incentive;
import com.jpmc.midascore.foundation.Transaction;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Component
public class IncentiveApiClient {
    private final RestTemplate restTemplate;
    private final String incentiveApiUrl;

    public IncentiveApiClient(RestTemplateBuilder restTemplateBuilder,
                              @Value("${incentive-api.url:http://localhost:8080/incentive}") String incentiveApiUrl) {
        this.restTemplate = restTemplateBuilder.build();
        this.incentiveApiUrl = incentiveApiUrl;
    }

    public Incentive getIncentive(Transaction transaction) {
        try {
            ResponseEntity<Incentive> response = restTemplate.postForEntity(incentiveApiUrl, transaction, Incentive.class);
            Incentive incentive = response.getBody();
            if (incentive == null) {
                return new Incentive();
            }
            return incentive;
        } catch (RestClientException exception) {
            return new Incentive();
        }
    }
}
