package soy.gabimoreno.merge2classesrefactorexample.classes

import soy.gabimoreno.merge2classesrefactorexample.interfaces.FooLegacyContract

class FooLegacy(
    override val property: String,
    override val fooLegacyProperty: String,
) : FooLegacyContract {

    override fun method() {

    }

    override fun fooLegacyMethod() {

    }
}
