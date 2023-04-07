package contracts.purchases

import org.springframework.cloud.contract.spec.Contract

[
        Contract.make {
            name("purchases success")
            request {
                method(POST())
                url("/purchases")
                headers {
                    contentType(applicationJson())
                }
                body([
                        bidderId: 1,
                        requestPackageId: 1
                ])
            }
            response {
                status(CREATED())
            }
        },
        Contract.make {
            name("requested package not found")
            request {
                method(POST())
                url("/purchases")
                headers {
                    contentType(applicationJson())
                }
                body([
                        bidderId: 1,
                        requestPackageId: 111
                ])
            }
            response {
                status(NOT_FOUND())
            }
        }
]