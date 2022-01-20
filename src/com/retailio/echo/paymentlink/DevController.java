package com.retailio.echo.paymentlink;
/*

import com.retailio.echo.service.CreditService;
import com.retailio.echo.service.PaymentService;
import com.retailio.echo.service.RDMService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "dev")
public class DevController {

    @Autowired
    private RDMService rdmService;

    @Autowired
    private CreditService creditService;

    @Autowired
    private PaymentService paymentService;

    private static final Logger logger = LoggerFactory.getLogger(DevController.class);

    @GetMapping(value = "/rdm")
    public ResponseEntity getMasterRetailer(@RequestParam Long retailerId) {

        return new ResponseEntity<Object>(rdmService.getMasterRetailer(retailerId), HttpStatus.OK);

    }

    @GetMapping(value = "/credit")
    public ResponseEntity getSmartBanner(@RequestParam Long retailerId) {

        return new ResponseEntity<Object>(creditService.getSmartBanner(retailerId), HttpStatus.OK);

    }

    @GetMapping
    public ResponseEntity getPaymentLink() {

        return new ResponseEntity<Object>(paymentService.getAdvancePaymentLink(1L, 1900L, "TEST01", 100.00, "7090009777", 1641794791000L), HttpStatus.OK);
    }
}
*/
