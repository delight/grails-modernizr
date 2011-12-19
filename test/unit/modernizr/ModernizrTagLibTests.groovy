package modernizr



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.GroovyPageUnitTestMixin} for usage instructions
 */
@TestFor(ModernizrTagLib)
class ModernizrTagLibTests {

    void testMod_ModernizrTag() {
    	def ra = new ModernizrTagLib()
		def modernizrVersion = ModernizrConfig.SHIPPED_VERSION
		// def modernizrFile = "modernizr-${modernizrVersion}.min.js"
    	assert ra.modernizr() == """<script src="null/js/modernizr/modernizr-${modernizrVersion}.min.js" type="text/javascript"></script>"""
    }

}
