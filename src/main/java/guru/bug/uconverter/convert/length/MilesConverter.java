/*
 * Copyright (c) 2017 Dimitrijs Fedotovs
 * This software may be modified and distributed under the terms of the MIT license.
 * See the LICENSE file for details.
 */

package guru.bug.uconverter.convert.length;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public class MilesConverter extends AbstractLengthConverter {
    @Override
    public String getUnitName() {
        return "Miles";
    }

    @Override
    public double toStandard(double miles) {
        return miles / 0.00062137d;
    }

    @Override
    public double fromStandard(double meters) {
        return meters * 0.00062137;
    }
}
