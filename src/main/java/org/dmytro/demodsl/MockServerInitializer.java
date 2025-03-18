package org.dmytro.demodsl;

import lombok.RequiredArgsConstructor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.dmytro.demodsl.entity.MockEndpointRequestDefinition;
import org.dmytro.demodsl.parser.DmytroMockDSLLexer;
import org.dmytro.demodsl.parser.DmytroMockDSLParser;
import org.dmytro.demodsl.parser.custom_listener.SyntaxErrorListener;
import org.dmytro.demodsl.service_visitors.MockEndpointRequestDefinitionProcessingService;
import org.dmytro.demodsl.service_visitors.MockServerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Profile("!test")
public class MockServerInitializer implements CommandLineRunner {


    private final MockServerService service;
    private final MockEndpointRequestDefinitionProcessingService mockEndpointRequestDefinitionProcessingService;

    @Override
    public void run(String... args) {

        String query =
                """
                
                DEFINE ENDPOINT {
                                
                    SET DESCRIPTION TO "Descrgffgiption"
                                
                    DEFINE REQUEST {
                        SET METHOD TO POST
                                
                        SET URL_MATCH_TYPE TO PATH_AND_QUERY
                                
                        SET REQUEST_PATH TO "/api/users2"
                                
                        SET PRIORITY TO 100
                                
                        
                                
                            ADD QUERY_PARAM_RULE {
                                SET NAME TO "USER_XXX"
                                ADD CONDITION {
                                    SET REQUEST_CONDITION_TYPE TO EQUALS
                                    SET VALUE TO "xxx"
                                }
                            }
                        }
                                
                        HEADERS {
                            ADD HEADER_RULE {
                                SET NAME TO "Authorization"
                                ADD CONDITION {
                                    NOT (
                                        SET REQUEST_CONDITION_TYPE TO EQUALS
                                        SET VALUE TO "Bearer 123"
                                    )
                                }
                            }
                        }
                                
                        COOKIES {
                            ADD COOKIE_RULE {
                                SET NAME TO "USER_COOKIE"
                                ADD CONDITION {
                                    NOT (
                                        SET REQUEST_CONDITION_TYPE TO EQUALS
                                        SET VALUE TO "AbrAcadabra"
                                    )
                                }
                            }
                        }
                                
                        FORM_PARAMS {
                            ADD FORM_PARAM_RULE {
                                SET NAME TO "FormMaParaMa"
                                ADD CONDITION {
                                    SET REQUEST_CONDITION_TYPE TO EQUALS
                                    SET VALUE TO "7777"
                                }
                            }
                        }
                                
                        REQUEST_BODY_RULES {
                                
                            //valueOnlyRequestBodyRuleCondition
                            ADD REQUEST_BODY_RULE {
                                SET REQUEST_BODY_CONDITION_TYPE TO EQUALS
                                SET VALUE TO 3
                            }
                            ADD REQUEST_BODY_RULE {
                                SET REQUEST_BODY_CONDITION_TYPE TO MATCHES_REGEX
                                SET VALUE TO "sasaas"
                            }
                            ADD REQUEST_BODY_RULE {
                                SET REQUEST_BODY_CONDITION_TYPE TO CONTAINS
                                SET VALUE TO "ssssssss"
                            }
                            ADD REQUEST_BODY_RULE {
                                SET REQUEST_BODY_CONDITION_TYPE TO MATCHES_JSON_SCHEMA
                                SET VALUE TO "sdsdqqqqqqq"
                            }
                                
                            //equalsXmlRequestBodyRuleCondition
                            ADD REQUEST_BODY_RULE {
                                SET REQUEST_BODY_CONDITION_TYPE TO EQUALS_XML
                                SET VALUE TO "<><>"
                                SET ENABLE_XMLUNIT_PLACEHOLDERS TO false
                            }
                                
                            ADD REQUEST_BODY_RULE {
                                SET REQUEST_BODY_CONDITION_TYPE TO EQUALS_XML
                                SET VALUE TO "<><>"
                                SET ENABLE_XMLUNIT_PLACEHOLDERS TO true
                            }
                                
                            ADD REQUEST_BODY_RULE {
                                SET REQUEST_BODY_CONDITION_TYPE TO EQUALS_XML
                                SET VALUE TO "<><>"
                            }
                                
                            //equalsJsonRequestBodyRuleCondition
                            ADD REQUEST_BODY_RULE {
                                SET REQUEST_BODY_CONDITION_TYPE TO EQUALS_JSON
                                SET VALUE TO "{}"
                            }
                                
                            ADD REQUEST_BODY_RULE {
                                SET REQUEST_BODY_CONDITION_TYPE TO EQUALS_JSON
                                SET VALUE TO "{}"
                                SET IGNORE_ARRAY_ORDER TO FALSE
                                SET IGNORE_EXTRA_ELEMENTS TO TRUE
                            }
                                
                            //isPresentRequestBodyRuleCondition
                             ADD REQUEST_BODY_RULE {
                                 NOT (
                                    SET REQUEST_BODY_CONDITION_TYPE TO IS_PRESENT
                                 )
                            }
                            ADD REQUEST_BODY_RULE {
                                SET REQUEST_BODY_CONDITION_TYPE TO IS_PRESENT
                            }
                                
                            //matchesJsonPathRequestBodyRuleCondition
                             ADD REQUEST_BODY_RULE {
                                SET REQUEST_BODY_CONDITION_TYPE TO MATCHES_JSON_PATH
                                SET NAME TO "$.name"
                                SET CONDITION_TYPE TO EQUALS
                                SET VALUE TO "aSDFSDF"
                            }
                                
                            ADD REQUEST_BODY_RULE {
                                SET REQUEST_BODY_CONDITION_TYPE TO MATCHES_JSON_PATH
                                SET NAME TO "$.name"
                                NOT (
                                    SET CONDITION_TYPE TO EQUALS
                                    SET VALUE TO "aSDFSDF"
                                )
                            }
                                
                            //matchesXPathRequestBodyRuleCondition
                             ADD REQUEST_BODY_RULE {
                                SET REQUEST_BODY_CONDITION_TYPE TO MATCHES_X_PATH
                                SET NAME TO "$.name"
                                SET CONDITION_TYPE TO EQUALS
                                SET VALUE TO "aSDFSDF"
                            }
                                
                            ADD REQUEST_BODY_RULE {
                                SET REQUEST_BODY_CONDITION_TYPE TO MATCHES_X_PATH
                                SET NAME TO "$.name"
                                NOT (
                                    SET CONDITION_TYPE TO EQUALS
                                    SET VALUE TO "aSDFSDF"
                                )
                            }
                        }
                    }
                                
                                
                //   DEFINE RESPONSE {
                //       ADD DIRECT RESPONSE {
                //           SET STATUS_CODE TO 200
                //           SET DYNAMIC_RESPONSE_TEMPLATING TO TRUE
                                
                //           HEADERS {
                //               ADD HEADER {
                //                   SET NAME TO "$.name"
                //                   SET VALUE TO "aSDFSDF"
                //               }
                //               ADD HEADER {
                //                   SET NAME TO "$.name"
                //                   SET VALUE TO "aSDFSDF"
                //               }
                //           }
                                
                //           SET BODY_TYPE TO XML
                //           SET VALUE TO "BODY"
                //       }
                                
                //      /*DELAY {
                //           SET TIME_UNIT TO MS
                //           SET DELAY_TYPE TO FIXED
                //           SET VALUE TO 300
                //       }*/
                                
                //      /* DELAY {
                //           SET DELAY_TYPE TO NO_DELAY
                //       }*/
                                
                //      DELAY {
                //          SET TIME_UNIT TO MS
                //          SET DELAY_TYPE TO RANDOM_UNIFORM
                //          SET LOWER_BOUND TO 300
                //          SET UPPER_BOUND TO 400
                //      }
                                
                //       /*DELAY {
                //           SET TIME_UNIT TO MS
                //           SET DELAY_TYPE TO RANDOM_LOG_NORMAL
                //           SET MEDIAN_DELAY TO 300
                //           SET STANDART_DEVIATION TO 400
                //       }*/
                                
                //       DELAY {
                //           SET TIME_UNIT TO MS
                //           SET DELAY_TYPE TO CHUNKED_DRIBBLE
                //           SET CHUNK_NUMBER TO 300
                //           SET TOTAL_DELAY TO 400
                //       }
                                
                //       WEB_HOOKS {
                //           ADD WEB_HOOK {
                //               SET METHOD TO POST
                //               SET URL TO "https://wc-echo.wiremockapi.cloud/webhook/echo"
                //               HEADERS {
                //                   ADD HEADER {
                //                       SET NAME TO "$.name"
                //                       SET VALUE TO "aSDFSDF"
                //                   }
                //               }
                //               //SET BODY_TYPE TO TEXT
                //               //SET BODY_TYPE TO JSON
                //               //SET BODY_TYPE TO XML
                //               //SET BODY_TYPE TO HTML
                //               SET BODY_TYPE TO BASE64
                //               SET VALUE TO "BODY"
                //           }
                //       }
                //   }
                                
                                
                //DEFINE RESPONSE {
                //        ADD FAULT RESPONSE {
                //            //SET FAULT_TYPE TO NO_FAULT
                //            //SET FAULT_TYPE TO CLOSE_SOCKET_WITH_NO_RESPONSE
                //            //SET FAULT_TYPE TO SEND_BAD_HTTP_DATA_THEN_CLOSE_SOCKET
                //            //SET FAULT_TYPE TO SEND_200_RESPONSE_THEN_BAD_HTTP_DATA_THEN_CLOSE_SOCKET
                //            SET FAULT_TYPE TO PEER_CONNECTION_RESET
                //        }
                //
                //        DELAY {
                //            SET TIME_UNIT TO MS
                //            SET DELAY_TYPE TO CHUNKED_DRIBBLE
                //            SET CHUNK_NUMBER TO 300
                //            SET TOTAL_DELAY TO 400
                //        }
                //
                //        WEB_HOOKS {
                //            ADD WEB_HOOK {
                //                SET METHOD TO POST
                //                SET URL TO "https://wc-echo.wiremockapi.cloud/webhook/echo"
                //                HEADERS {
                //                    ADD HEADER {
                //                        SET NAME TO "$.name"
                //                        SET VALUE TO "aSDFSDF"
                //                    }
                //                }
                //                //SET BODY_TYPE TO TEXT
                //                //SET BODY_TYPE TO JSON
                //                //SET BODY_TYPE TO XML
                //                //SET BODY_TYPE TO HTML
                //                SET BODY_TYPE TO BASE64
                //                SET VALUE TO "BODY"
                //            }
                //        }
                //    }
                                
                   DEFINE RESPONSE {
                       ADD PROXY RESPONSE {
                           SET URL TO "https://wc-echo.wiremockapi.cloud/webhook/echo"
                          
                           HEADERS {
                               ADD HEADER {
                                   SET NAME TO "$.name"
                                   SET VALUE TO "aSDFSDF"
                               }
                               ADD HEADER {
                                   SET NAME TO "$.name"
                                   SET VALUE TO "aSDFSDF"
                               }
                           }
                            SET TEMPLATING TO TRUE
                            SET HOSTNAME_REWRITING TO FALSE            
                       }
                      
                      DELAY {
                          SET TIME_UNIT TO MS
                          SET DELAY_TYPE TO RANDOM_UNIFORM
                          SET LOWER_BOUND TO 300
                          SET UPPER_BOUND TO 400
                      }
                                
                       WEB_HOOKS {
                           ADD WEB_HOOK {
                               SET METHOD TO POST
                               SET URL TO "https://wc-echo.wiremockapi.cloud/webhook/echo"
                               HEADERS {
                                   ADD HEADER {
                                       SET NAME TO "$.name"
                                       SET VALUE TO "aSDFSDF"
                                   }
                               }
                               //SET BODY_TYPE TO TEXT
                               //SET BODY_TYPE TO JSON
                               //SET BODY_TYPE TO XML
                               //SET BODY_TYPE TO HTML
                               SET BODY_TYPE TO BASE64
                               SET VALUE TO "BODY"
                           }
                       }
                   }
                                
                }
                
                
                """;

      service.defineEndpoint(query);
    }
}
