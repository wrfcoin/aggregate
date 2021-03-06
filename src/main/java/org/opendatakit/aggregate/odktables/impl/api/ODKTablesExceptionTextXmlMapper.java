/*
 * Copyright (C) 2012-2013 University of Washington
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.opendatakit.aggregate.odktables.impl.api;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.opendatakit.aggregate.odktables.exception.ODKTablesException;

@Produces({ MediaType.TEXT_XML })
@Provider
public class ODKTablesExceptionTextXmlMapper implements ExceptionMapper<ODKTablesException> {

  ODKTablesExceptionMapper mapper = new ODKTablesExceptionMapper(MediaType.TEXT_XML_TYPE);

  @Override
  public Response toResponse(ODKTablesException e) {
    return mapper.toResponse(e);
  }

}
