package soy.gabimoreno.merge2classesrefactorexample.classes

import soy.gabimoreno.merge2classesrefactorexample.interfaces.NewFoo as NewFooI

class DefaultNewFoo(
    override val property: String,
    override val fooProperty: String,
    override val fooLegacyProperty: String = "",
) : NewFooI {

    override fun method() {

    }

    override fun fooMethod() {

    }

    override fun fooLegacyMethod() {
    }
}
