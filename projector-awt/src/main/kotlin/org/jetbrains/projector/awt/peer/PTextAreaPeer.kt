/*
 * Copyright (c) 2019-2022, JetBrains s.r.o. and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation. JetBrains designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact JetBrains, Na Hrebenech II 1718/10, Prague, 14000, Czech Republic
 * if you need additional information or have any questions.
 */
@file:Suppress("JAVA_MODULE_DOES_NOT_EXPORT_PACKAGE")

package org.jetbrains.projector.awt.peer

import java.awt.Dimension
import java.awt.TextArea
import java.awt.im.InputMethodRequests
import java.awt.peer.TextAreaPeer

class PTextAreaPeer(target: TextArea) : PTextComponentPeer(target), TextAreaPeer {

  override fun getInputMethodRequests(): InputMethodRequests? {
    return null
  }

  override fun insert(text: String, pos: Int) {}

  override fun replaceRange(text: String, start: Int, end: Int) {}

  override fun getPreferredSize(rows: Int, columns: Int): Dimension? {
    return null
  }

  override fun getMinimumSize(rows: Int, columns: Int): Dimension? {
    return null
  }
}
