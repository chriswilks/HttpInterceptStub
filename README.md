# HttpStub

Uses WireMock to stub a service with a generic response and the requests
made to downstream services can be asserted in your tests.

Useful for component testing in Microservices architectures while
keeping code in your test classes minimal.

## Usage

1. Extend GenericStubTest in your Test classes.
2. Use RestAssured to make requests to the first service in test.
3. Call verify methods to check the requests made to your stub.