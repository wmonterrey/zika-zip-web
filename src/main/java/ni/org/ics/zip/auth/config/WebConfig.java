package ni.org.ics.zip.auth.config;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
	    LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
	    localeChangeInterceptor.setParamName("lang");
	    registry.addInterceptor(localeChangeInterceptor);
	}
	@Bean
	public LocaleResolver localeResolver() {
	    CookieLocaleResolver cookieLocaleResolver = new CookieLocaleResolver();
	    cookieLocaleResolver.setCookieName("zikaLang");
	    cookieLocaleResolver.setDefaultLocale(new Locale("es"));
	    cookieLocaleResolver.setCookiePath("/zika-zip/");
	    cookieLocaleResolver.setCookieMaxAge(31536000);
	    return cookieLocaleResolver;
	}
 
}