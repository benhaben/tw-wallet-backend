package com.thoughtworks.wallet.healthy.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.thoughtworks.wallet.healthy.model.Result;
import lombok.Getter;
import org.hibernate.validator.constraints.Length;
import org.springframework.boot.context.properties.bind.DefaultValue;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class HealthVerificationRequest {
    @Getter
    String did;

    @Length(min = 11, max = 11, message = "Phone number should only have 11 digits.")
    @Getter
    String phone;

    @Getter
    @Max(value = 42, message = "Please input valid temperature, should between 35° to 42°")
    @Min(value = 35, message = "Please input valid temperature, should between 35° to 42°")
    float temperature;

    @Getter
    Result contact;

    @Getter
    Result symptoms;

    @Getter
    boolean onChain;


    @JsonCreator
    public HealthVerificationRequest(@JsonProperty("phone") String phone,
                                     @JsonProperty("did") String did,
                                     @JsonProperty("temperature") float temperature,
                                     @JsonProperty("contact") Result contact,
                                     @JsonProperty("symptoms") Result symptoms,
                                     @JsonProperty("onchain") boolean onChain) {
        this.did = did;
        this.phone = phone;
        this.temperature = temperature;
        this.contact = contact;
        this.symptoms = symptoms;
        this.onChain = onChain;
    }
}
