package com.thoughtworks.wallet.asset.annotation;

import org.springframework.beans.factory.annotation.Value;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Value("${quorum.identity-registry.contract-address}")
@Retention(RetentionPolicy.RUNTIME)
public @interface IdentityRegistryContractAddress {
}

