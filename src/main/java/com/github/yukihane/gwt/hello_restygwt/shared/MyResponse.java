package com.github.yukihane.gwt.hello_restygwt.shared;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * http://saihoooooooo.hatenablog.com/entry/2015/01/22/170254 の確認.
 */
@XmlRootElement
public class MyResponse {

    private List<String> list = new ArrayList<>();

    public MyResponse() {
    }

    public MyResponse(final String... str) {
        list.addAll(Arrays.asList(str));
    }

    public List<String> getList() {
        return list;
    }

    public void setList(final List<String> list) {
        this.list = list;
    }

}
