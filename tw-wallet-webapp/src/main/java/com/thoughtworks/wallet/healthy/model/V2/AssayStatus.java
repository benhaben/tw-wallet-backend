package com.thoughtworks.wallet.healthy.model.V2;

import lombok.Getter;
import lombok.Setter;

public enum AssayStatus {
    Negative("Negative"),
    Positive("Positive");

    @Getter
    @Setter
    private String status;

    AssayStatus(String status) {
        this.status = status;
    }
}