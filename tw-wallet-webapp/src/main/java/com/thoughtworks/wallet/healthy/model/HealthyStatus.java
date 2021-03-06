package com.thoughtworks.wallet.healthy.model;

import lombok.Getter;
import lombok.Setter;

public enum HealthyStatus {
    HEALTHY("healthy"),
    UNHEALTHY("unhealthy");

    @Getter
    @Setter
    private String status;

    HealthyStatus(String status) {
        this.status = status;
    }
}
