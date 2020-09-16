package me.toam.core.concurrency.threadsafety.shareresource;

public class NotThreadSafe {
    StringBuilder builder = new StringBuilder();

    public String add (String value) {
        return this.builder.append(value).toString();
    }
}
