package com.appFinance.finance.controllers.v1;

import com.appFinance.finance.controllers.AbstractWalletsController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "wallets/v1", produces = MediaType.APPLICATION_JSON_VALUE)
public class WalletsController extends AbstractWalletsController {
}
