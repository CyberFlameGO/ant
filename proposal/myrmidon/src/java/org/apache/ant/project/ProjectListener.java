/*
 * Copyright (C) The Apache Software Foundation. All rights reserved.
 *
 * This software is published under the terms of the Apache Software License
 * version 1.1, a copy of which has been included with this distribution in
 * the LICENSE file.
 */
package org.apache.ant.project;

public interface ProjectListener
{
    void projectStarted( String projectName );
    void projectFinished();

    void targetStarted( String targetName );
    void targetFinished();

    void taskletStarted( String taskletName );
    void taskletFinished();

    void log( String message );
    void log( String message, Throwable throwable );
}
