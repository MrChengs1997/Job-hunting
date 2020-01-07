package core.design.util;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

public class URLUtil {


    //httpXXXXXX?xx='xx'&xxx='xxx'
    public static URI getURI(String baseUrl, MultiValueMap<String, String> params){
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseUrl);
        URI uri = builder.queryParams(params).build().encode().toUri();
        return uri;
    }


}
