package contracts.purchases

import org.springframework.cloud.contract.spec.Contract

[
        Contract.make {
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
                status(OK())
                headers {
                    contentType(applicationJson())
                }
                body([
                        code: 200,
                        message: "Success",
                        body: [
                                id: 100,
                                bidder: [
                                        id: 1,
                                        name: "bidder name"
                                ],
                                requestPackage: [
                                        id: 1,
                                        content: "package content"
                                ]
                        ]
                ])
            }
        }
]