/*******************************************************************************
 * Copyright (c) 2013, 2020 IBM Corporation.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    IBM Corporation - Initial API and implementation
 *******************************************************************************/



package org.eclipse.emf.examples.extlibrary.provider;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

/**
 * This is the central singleton for the EXTLibrary edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class EXTLibraryEditPlugin extends EMFPlugin 
{
  /**
   * Keep track of the singleton.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final EXTLibraryEditPlugin INSTANCE = new EXTLibraryEditPlugin();

  /**
   * Keep track of the singleton.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static Implementation plugin;

  /**
   * Create the instance.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXTLibraryEditPlugin()
  {
    super
      (new ResourceLocator [] 
       {
       });
  }

  /**
   * Returns the singleton instance of the Eclipse plugin.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the singleton instance.
   * @generated
   */
  @Override
  public ResourceLocator getPluginResourceLocator()
  {
    return plugin;
  }

  /**
   * Returns the singleton instance of the Eclipse plugin.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the singleton instance.
   * @generated
   */
  public static Implementation getPlugin()
  {
    return plugin;
  }

  /**
   * The actual implementation of the Eclipse <b>Plugin</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static class Implementation extends EclipsePlugin 
  {
    /**
     * Creates an instance.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Implementation()
    {
      super();

      // Remember the static instance.
      //
      plugin = this;
    }
  }

}
