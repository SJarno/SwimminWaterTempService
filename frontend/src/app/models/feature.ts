import { Coordinates } from "./coordinate"
import { Property } from "./properties"

export interface Feature {
    type: string
    id: string
    geometry: Coordinates
    properties: Property
}
