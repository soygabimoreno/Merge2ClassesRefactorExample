package soy.gabimoreno.merge2classesrefactorexample.proxy

import soy.gabimoreno.merge2classesrefactorexample.classes.DefaultNewFoo
import soy.gabimoreno.merge2classesrefactorexample.classes.Foo
import soy.gabimoreno.merge2classesrefactorexample.classes.FooLegacy
import soy.gabimoreno.merge2classesrefactorexample.interfaces.FooContract
import soy.gabimoreno.merge2classesrefactorexample.interfaces.FooLegacyContract
import soy.gabimoreno.merge2classesrefactorexample.interfaces.NewFooContract

class FooProxy(
    private val isFeatureFlagEnabled: IsFeatureFlagEnabled,
) {

    fun getFoo(): FooContract {
        return if (isFeatureFlagEnabled()) {
            buildDefaultNewFoo()
        } else {
            buildFoo()
        }
    }

    fun getFooLegacy(): FooLegacyContract {
        return if (isFeatureFlagEnabled()) {
            buildDefaultNewFoo()
        } else {
            buildFooLegacy()
        }
    }
}

fun buildDefaultNewFoo(): NewFooContract {
    return DefaultNewFoo(
        property = "",
        fooProperty = "",
        fooLegacyProperty = ""
    )
}

fun buildFoo(): FooContract {
    return Foo(
        property = "",
        fooProperty = "",
    )
}

fun buildFooLegacy(): FooLegacyContract {
    return FooLegacy(
        property = "",
        fooLegacyProperty = ""
    )
}
