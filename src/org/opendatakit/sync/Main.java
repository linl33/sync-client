package org.opendatakit.sync;

import org.apache.wink.json4j.JSONException;
import org.opendatakit.sync.client.SyncClient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class Main {
  public static void main(String[] args) throws IOException, JSONException {
    SyncClient syncClient = new SyncClient();

    syncClient.init("ec2-52-25-205-39.us-west-2.compute.amazonaws.com", "bsmith", "pass");

    ArrayList<Map<String, Object>> users = syncClient.getUsers("http://ec2-52-25-205-39.us-west-2.compute.amazonaws.com/odktables", "default");

    System.out.println(users);
  }
}
