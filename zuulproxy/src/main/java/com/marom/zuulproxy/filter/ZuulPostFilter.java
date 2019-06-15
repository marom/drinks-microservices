package com.marom.zuulproxy.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.StreamUtils;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.UUID;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.POST_TYPE;

@Slf4j
@Component
public class ZuulPostFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return POST_TYPE;
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {

        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletResponse response = ctx.getResponse();

        InputStream stream = ctx.getResponseDataStream();
        String body;
        try {
            body = StreamUtils.copyToString(stream, Charset.forName("UTF-8"));
            body = "Modified via setResponseDataStream(): " + body;
            ctx.setResponseDataStream(new ByteArrayInputStream(body.getBytes("UTF-8")));

        } catch (IOException e) {
            e.printStackTrace();
        }

        // add another header
        response.addHeader("X-Sample", UUID.randomUUID().toString());

        log.info(String.format("POST-FILTER %s response status and header: %s", response.getStatus(), response.getHeader("DrinkHeader")));
        return null;
    }
}
