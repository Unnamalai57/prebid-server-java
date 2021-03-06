package org.prebid.server.bidder.beachfront.model;

import lombok.AllArgsConstructor;
import lombok.Value;

@AllArgsConstructor(staticName = "of")
@Value
public class BeachfrontRequests {

    BeachfrontBannerRequest bannerRequest;

    BeachfrontVideoRequest videoRequest;
}
