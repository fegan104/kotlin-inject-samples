package com.fredporciuncula.inject.greeter

import me.tatarka.inject.annotations.Inject
import platform.Foundation.NSCharacterSet
import platform.Foundation.NSString
import platform.Foundation.NSURL
import platform.Foundation.URLQueryAllowedCharacterSet
import platform.Foundation.stringByAddingPercentEncodingWithAllowedCharacters
import platform.UIKit.UIApplication
import software.amazon.lastmile.kotlin.inject.anvil.AppScope
import software.amazon.lastmile.kotlin.inject.anvil.ContributesBinding

@Inject
@ContributesBinding(AppScope::class)
class IosGreeter : Greeter {
  override fun greet(greeting: String) {
    val encodedGreeting = (greeting as NSString) // AS may complain but cast is actually fine here
      .stringByAddingPercentEncodingWithAllowedCharacters(NSCharacterSet.URLQueryAllowedCharacterSet)
    val url = "https://www.google.com/search?q=$encodedGreeting"
    val nsUrl = NSURL.URLWithString(url)
    UIApplication.sharedApplication.openURL(nsUrl!!, emptyMap<Any?, Unit>()) { println(it) }
  }
}
