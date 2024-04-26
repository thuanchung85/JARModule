/*
 * Copyright 2019-2021 Signal Messenger, LLC
 * SPDX-License-Identifier: AGPL-3.0-only
 */

package org.signal.ringrtcChung;

/**
* A simple exception class that can be thrown by any of the {@link
* org.signal.ringrtcChung.CallManager} class methods.
*/
public class CallException extends Exception {
  public CallException() {
  }

  public CallException(String detailMessage) {
    super(detailMessage);
  }

  public CallException(String detailMessage, Throwable throwable) {
    super(detailMessage, throwable);
  }

  public CallException(Throwable throwable) {
    super(throwable);
  }
}
