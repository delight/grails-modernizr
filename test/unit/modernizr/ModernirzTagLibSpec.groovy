package modernizr

import grails.test.mixin.TestFor
import spock.lang.Specification
import grails.test.mixin.web.GroovyPageUnitTestMixin

/**
 * See the API for {@link grails.test.mixin.web.GroovyPageUnitTestMixin} for usage instructions
 */
@TestFor(ModernirzTagLib)
@TestMixin(GroovyPageUnitTestMixin)
class ModernirzTagLibSpec extends Specification {

	def modernizrVersion = ModernizrConfig.SHIPPED_VERSION

    void "test mod:modernizr tag"() {
		expect:
			applyTemplate('<mod:modernizr />') == """<script src="null/js/modernizr/modernizr-${modernizrVersion}.min.js" type="text/javascript"></script>"""
    }
}
