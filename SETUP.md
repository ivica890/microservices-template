To start a Keycloak server using Docker, run the following command:

```sh
docker run -p 7080:8080 --name keycloak-server -e KC_BOOTSTRAP_ADMIN_USERNAME=admin -e KC_BOOTSTRAP_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:26.1.2 start-dev