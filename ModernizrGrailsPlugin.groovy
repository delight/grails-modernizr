/*
 * Copyright 2012-2013 Konstantinos Kostarellis.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
class ModernizrGrailsPlugin {
    def version = "2.7.1.1"
    def grailsVersion = "1.3 > *"
    def title = "Modernizr for Grails"
    def author = "Konstantinos Kostarellis"
    def authorEmail = "kosta.grails@gmail.com"
    def description = '''\
Provides the JavaScript library Modernizr. Modernizr helps you build the next generation of HTML5 and CSS3-powered websites.
It integrates nicely with the resources plugin.
'''

    def documentation = "http://grails.org/plugin/modernizr"

    def license = "APACHE"
    def developers = [
        [name: "Konstantinos Kostarellis", email: "kosta.grails@gmail.com"]
    ]
    def issueManagement = [system: "GITHUB", url: "https://github.com/delight/grails-modernizr/issues"]
    def scm = [url: "https://github.com/delight/grails-modernizr"]
}
