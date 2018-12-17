/**
* @api {get} personas/
* @apiName Get Personas
* @apiGroup Persona
* @apiVersion 0.0.1
* @apiSuccess {json} Lista de personas0
*/


/**
* @api {get} persona/?id=:id
* @apiName Get Persona
* @apiGroup Persona
* @apiVersion 0.0.1
* @apiParam {String} id
* @apiSuccess (200) {json} persona informacion de la persona
*/

/**
* @api {post} persona
* @apiName Registrar Persona
* @apiGroup Persona
* @apiVersion 0.0.1
* @apiParam {String} nombre
* @apiParam {String} paterno
* @apiParam {String} materno
* @apiParam {Int} id_direccion
* @apiParam {String} email
* @apiParam {String} telefono_casa
* @apiParam {String} telefono_celular
* @apiParam {String} rfc
* @apiSuccess (200) {json} persona informacion de la nueva persona
*/
