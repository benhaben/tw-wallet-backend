# 1. verifiable claim

Date: 2020-05-20

## Status

2020-05-20 completed

## Context

1. issuer should have a choice to save claim proof to blockchain
2. if save claim proof to blockchain, issuer can revoke claim in the future

## Decision

1. Save to blockchain is optional

## Consequences

change interface of /v1/health-certifications

```$xslt
HealthVerificationRequest{
    phone	string
    did	string
    temperature	number($float)
    contact	string
    symptoms	string
    onchain	boolean
}
```
add `onchain` field, if set it as false, do not send it to Smart Contract.