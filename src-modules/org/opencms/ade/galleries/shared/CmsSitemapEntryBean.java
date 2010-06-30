/*
 * File   : $Source: /alkacon/cvs/opencms/src-modules/org/opencms/ade/galleries/shared/Attic/CmsSitemapEntryBean.java,v $
 * Date   : $Date: 2010/06/30 13:54:43 $
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

package org.opencms.ade.galleries.shared;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * An RPC bean representing a sitemap entry.<p>
 * 
 * @author Georg Westenberger
 * 
 * @version $Revision: 1.1 $
 * 
 * @since 8.0.0
 */
public class CmsSitemapEntryBean implements IsSerializable {

    /** The URL name of the sitemap entry. */
    private String m_name;

    /** The site path of the sitemap entry. */
    private String m_sitePath;

    /** The title of the sitemap entry. */
    private String m_title;

    /**
     * Constructor.<p>
     * 
     * @param sitePath the site path 
     * @param name the URL name 
     * @param title the title 
     */
    public CmsSitemapEntryBean(String sitePath, String name, String title) {

        m_title = title;
        m_name = name;
        m_sitePath = sitePath;
    }

    /**
     * Hidden default constructor.<p>
     */
    protected CmsSitemapEntryBean() {

        // do nothing 
    }

    /**
     * Gets the URL name.<p>
     * 
     * @return the URL name 
     */
    public String getName() {

        return m_name;
    }

    /**
     * Returns the site path.<p>
     * 
     * @return the site path 
     */
    public String getSitePath() {

        return m_sitePath;
    }

    /**
     * Returns the title.<p>
     * 
     * @return the title 
     */
    public String getTitle() {

        return m_title;
    }

}
