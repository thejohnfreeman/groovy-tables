package org.tools4j.groovytables.model

import groovy.transform.EqualsAndHashCode

/**
 * User: ben
 * Date: 23/03/2016
 * Time: 5:20 PM
 */


@EqualsAndHashCode
class QuoteHistoryUsingList {
    final String symbol
    final Side side
    final List<Double> prices

    QuoteHistoryUsingList(final String symbol, final Side side, final List<Double> prices) {
        this.symbol = symbol
        this.side = side
        this.prices = prices
    }

    @Override
    public String toString() {
        return "QuoteHistory{" +
                "symbol='" + symbol + '\'' +
                ", side=" + side +
                ", prices=" + prices +
                '}';
    }
}
