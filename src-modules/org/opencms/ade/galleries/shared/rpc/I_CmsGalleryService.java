/*
 * File   : $Source: /alkacon/cvs/opencms/src-modules/org/opencms/ade/galleries/shared/rpc/Attic/I_CmsGalleryService.java,v $
 * Date   : $Date: 2010/06/30 13:54:43 $
 * Version: $Revision: 1.10 $
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

package org.opencms.ade.galleries.shared.rpc;

import org.opencms.ade.galleries.shared.CmsGalleryDataBean;
import org.opencms.ade.galleries.shared.CmsGalleryFolderBean;
import org.opencms.ade.galleries.shared.CmsGallerySearchBean;
import org.opencms.ade.galleries.shared.CmsSitemapEntryBean;
import org.opencms.ade.galleries.shared.CmsVfsEntryBean;
import org.opencms.gwt.CmsRpcException;
import org.opencms.gwt.shared.CmsCategoryTreeEntry;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * Handles all RPC services related to the gallery dialog.<p>
 * 
 * @author Polina Smagina
 * @author Tobias Herrmann
 * 
 * @version $Revision: 1.10 $ 
 * 
 * @since 8.0.0
 * 
 * @see org.opencms.ade.galleries.CmsGalleryService
 * @see org.opencms.ade.galleries.shared.rpc.I_CmsGalleryService
 * @see org.opencms.ade.galleries.shared.rpc.I_CmsGalleryServiceAsync
 */
@RemoteServiceRelativePath("org.opencms.ade.galleries.CmsGalleryService.gwt")
public interface I_CmsGalleryService extends RemoteService {

    /**
     * Returns all available categories for given galleries.<p>
     * 
     * @param galleries the galleries
     * 
     * @return the category tree root entry
     * 
     * @throws CmsRpcException if something goes wrong
     */
    CmsCategoryTreeEntry getCategoryTreeGalleries(List<String> galleries) throws CmsRpcException;

    /**
     * Returns all available categories for given resource types, by looking up associated galleries first.<p>
     * 
     * Only use this if no galleries list is available.<p>
     * 
     * @param types the resource types
     * 
     * @return the category tree root entry
     * 
     * @throws CmsRpcException is something goes wrong
     */
    CmsCategoryTreeEntry getCategoryTreeTypes(List<String> types) throws CmsRpcException;

    /**
     * Returns the available galleries depending on the given resource types.<p>
     * 
     * @param resourceTypes the resource types
     * 
     * @return the galleries
     * 
     * @throws CmsRpcException if something goes wrong
     */
    List<CmsGalleryFolderBean> getGalleries(List<String> resourceTypes) throws CmsRpcException;

    /**
     * Returns the initial data for the given gallery mode.<p>
     * 
     * @return the data bean
     * 
     * @throws CmsRpcException if something goes wrong
     */
    CmsGalleryDataBean getInitialSettings() throws CmsRpcException;

    /**
     * Performs an initial search based on the given data bean and the available parameters of the request.<p>
     * 
     * @param data the data bean
     * 
     * @return the search result
     * 
     * @throws CmsRpcException if something goes wrong
     */
    CmsGallerySearchBean getSearch(CmsGalleryDataBean data) throws CmsRpcException;

    /**
     * Returns the gallery search object containing search results and the currant search parameter.<p>  
     * 
     * @param searchObj the current search object
     * @return the search object containing search results
     * @throws CmsRpcException is something goes wrong
     */
    CmsGallerySearchBean getSearch(CmsGallerySearchBean searchObj) throws CmsRpcException;

    /**
     * Returns the sitemap sub-entries of a given sitemap path.<p>
     * 
     * @param path the sitemap path 
     * 
     * @return the sub-entries of the path 
     * 
     * @throws CmsRpcException if something goes wrong 
     */
    List<CmsSitemapEntryBean> getSitemapSubEntries(String path) throws CmsRpcException;

    /**
     * Gets the sub-folders of a folder.<p>
     * 
     * @param path the path of a folder
     * 
     * @return beans representing the sub-folders of the folder
     *  
     * @throws CmsRpcException if something goes wrong 
     */
    List<CmsVfsEntryBean> getSubFolders(String path) throws CmsRpcException;

}