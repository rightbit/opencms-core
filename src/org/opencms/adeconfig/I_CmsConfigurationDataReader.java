/*
 * File   : $Source: /alkacon/cvs/opencms/src/org/opencms/adeconfig/Attic/I_CmsConfigurationDataReader.java,v $
 * Date   : $Date: 2011/02/02 07:37:52 $
 * Version: $Revision: 1.1 $
 *
 * This library is part of OpenCms -
 * the Open Source Content Management System
 *
 * Copyright (C) 2002 - 2009 Alkacon Software (http://www.alkacon.com)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * For further information about Alkacon Software, please see the
 * company website: http://www.alkacon.com
 *
 * For further information about OpenCms, please see the
 * project website: http://www.opencms.org
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package org.opencms.adeconfig;

import org.opencms.file.CmsObject;
import org.opencms.main.CmsException;

/**
 * An interface which provides a method for reading configuration data from the VFS.<p>
 * 
 * @param <Config> the type of configuration data 
 * 
 * @author Georg Westenberger
 * 
 * @version $Revision: 1.1 $
 * 
 * @since 8.0.0
 */
public interface I_CmsConfigurationDataReader<Config> {

    /**
     * Reads the configuration data from the given path.<p>
     *  
     * @param cms the CMS context to use 
     * @param path the path from which to use the configuration 
     * 
     * @return the configuration data which was read from the path 
     * 
     * @throws CmsException if something goes wrong 
     */
    Config getConfiguration(CmsObject cms, String path) throws CmsException;

}