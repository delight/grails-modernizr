Modernizr for Grails - Build the next generation of HTML5 and CSS3-powered websites.
===

The Plugin provides the JavaScript library Modernizr. Modernizr helps you build the next generation of HTML5 and CSS3-powered websites.
It offers the un-minified version of the JavaScript-Library in the Development-Stage and the minified elseways.
It integrates nicely with the resources plugin.

Note: The plugin is esp. useful in Development-Stage. For an optimal experience in production it is better to build your specific version 
of the JavaScript-Library as it is unlikely that you will use all of the over 40+ tests. Checkout http://www.modernizr.com/download/ for a cumstomized version.

What is it?
---
Modernizr is a small JavaScript library that detects the availability of native implementations for next-generation web technologies, i.e. features that stem from the HTML5 and CSS3 specifications. Many of these features are already implemented in at least one major browser (most of them in two or more), and what Modernizr does is, very simply, tell you whether the current browser has this feature natively implemented or not.

Why use Modernizr?
---
Taking advantage of the new capabilities of HTML5 and CSS3 can mean sacrificing control over the experience in older browsers. Modernizr 2 is your starting point for making the best websites and applications that work exactly right no matter what browser or device your visitors use.

Thanks to the new Media Query tests and built-in YepNope.js http://yepnopejs.com/ micro-library as Modernizr.load(), you can now combine feature detection with media queries and conditional resource loading. That gives you the power and flexibility to optimize for every circumstance.

To get started -- checkout http://www.modernizr.com/

Installation:
---
grails install-plugin modernizr

Usage:
---
If you want to use it with the resources plugin http://grails.org/plugin/resources you can use the resources TagLib to include the modernizr module in your gsp.

	<r:require module="modernizr" />

For developers that don't use the resources plugin the modernizr plugin also provides a TagLib that conviniently adds the modernizr js library to your gsp. It
offers the same feature set regarding minified in non-dev-stage vs. un-minified in dev-stage.

	<mod:modernizr />

Versioning
---
Plugin version convetion is 

	<javascript-libraryversion>.<plugin-minor-for-fixes>

Copyright and License
---

modernizr plugin:

Copyright © 2012-2013 Konstantinos Kostarellis

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

Modernizr JavaScript Library is available under the MIT license:

http://modernizr.com/license/
