package com.yeetor.util;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by harry on 2017/4/17.
 */
public class Constant {

    public static final String PROP_ABI = "ro.product.cpu.abi";
    public static final String PROP_SDK = "ro.build.version.sdk";

    public static File getResourceDir() {
        File resources = new File(new File(System.getProperty("java.class.path")).getParent(), "resources");
        return resources;
    }

    public static File getMinicap(String abi) {
        File resources = getResourceDir();
        if (resources.exists()) {
            return new File(resources, "minicap" + File.separator + "bin" +
                    File.separator + abi + File.separator + "minicap");
        }
        return null;
    }

    public static File getMinicapSo(String abi, String sdk) {
        File resources = getResourceDir();
        if (resources.exists()) {
            return new File(resources, "minicap" + File.separator + "shared" +
                    File.separator + "android-" + sdk + File.separator + abi + File.separator + "minicap.so");
        }
        return null;
    }

    public static File getMinitouchBin(String abi) {
        File resources = getResourceDir();
        if (resources.exists()) {
            return new File(resources, "minitouch" + File.separator +
                    File.separator + abi + File.separator + "minitouch");
        }
        return null;
    }

}
