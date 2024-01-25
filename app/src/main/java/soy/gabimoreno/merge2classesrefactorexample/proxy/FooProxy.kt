package soy.gabimoreno.merge2classesrefactorexample.proxy

import soy.gabimoreno.merge2classesrefactorexample.classes.DefaultFoo
import soy.gabimoreno.merge2classesrefactorexample.classes.DefaultFooLegacy
import soy.gabimoreno.merge2classesrefactorexample.classes.DefaultNewFoo

import soy.gabimoreno.merge2classesrefactorexample.interfaces.NewFoo as NewFooI

class FooProxy(
    private val isFeatureFlagEnabled: IsFeatureFlagEnabled,
) {

    fun getFoo(): NewFooI {
        return if (isFeatureFlagEnabled()) {
            buildDefaultNewFoo()
        } else {
            buildDefaultFoo()
        }
    }

    fun getFooLegacy(): NewFooI {
        return if (isFeatureFlagEnabled()) {
            buildDefaultNewFoo()
        } else {
            buildDefaultFooLegacy()
        }
    }
}

fun buildDefaultNewFoo(): NewFooI {
    return DefaultNewFoo(
        property = "",
        fooProperty = "",
        fooLegacyProperty = ""
    )
}

fun buildDefaultFoo(): NewFooI {
    return DefaultFoo(
        property = "",
        fooProperty = "",
        fooLegacyProperty = ""
    )
}

fun buildDefaultFooLegacy(): NewFooI {
    return DefaultFooLegacy(
        property = "",
        fooProperty = "",
        fooLegacyProperty = ""
    )
}
