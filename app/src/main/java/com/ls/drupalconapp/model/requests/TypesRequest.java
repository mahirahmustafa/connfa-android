package com.ls.drupalconapp.model.requests;

import com.ls.drupal.AbstractDrupalEntityContainer;
import com.ls.drupal.DrupalClient;
import com.ls.drupalconapp.model.data.Type;
import com.ls.http.base.BaseRequest;

import java.util.Map;

/**
 * Created on 08.06.2015.
 */
public class TypesRequest extends AbstractDrupalEntityContainer<Type.Holder> {

    public TypesRequest(DrupalClient client) {
        super(client, new Type.Holder());
    }

    @Override
    protected String getPath() {
        return "getTypes";
    }

    @Override
    protected Map<String, String> getItemRequestPostParameters() {
        return null;
    }

    @Override
    protected Map<String, String> getItemRequestGetParameters(BaseRequest.RequestMethod method) {
        return null;
    }
}